#!/bin/bash

# Variables
JAR_NAME="dist/TOAv1.2.0.jar"
MAIN_CLASS="YourMainClassName"

# Function to compile and package the JAR
build_and_package() {
    echo "Building project..."
    mkdir -p bin dist || { echo "Failed to create directories. ❌"; exit 1; }

    echo "Compiling Java files..."
    javac -d bin src/*.java || { echo "Compilation failed. ❌"; exit 1; }

    echo "Packaging JAR file..."
    echo "Main-Class: $MAIN_CLASS" > MANIFEST.MF
    jar cfm $JAR_NAME MANIFEST.MF -C bin . || { echo "JAR packaging failed. ❌"; exit 1; }

    echo "JAR file created: $JAR_NAME ✅"
}

# Check if the JAR file exists
if [[ -f "$JAR_NAME" ]]; then
    echo "JAR file already exists: $JAR_NAME ✅"
else
    echo "JAR file not found. Building it now..."
    build_and_package
fi

# Run the JAR file
echo "Running the game..."
java -jar $JAR_NAME || { echo "Failed to run the JAR. ❌"; exit 1; }

echo "Enjoy the game! 🎮✨"
