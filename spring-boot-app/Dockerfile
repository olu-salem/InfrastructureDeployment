# Use the official Ubuntu 22.04 base image
FROM ubuntu:22.04

# Set environment variable to avoid interactive prompts during package installations
ENV DEBIAN_FRONTEND=noninteractive

# Set the working directory
WORKDIR /minecraft

# Install OpenJDK 17, wget, and clean up
RUN apt-get update && apt-get install -y \
    openjdk-17-jdk \
    wget \
    && rm -rf /var/lib/apt/lists/*

# Download the Minecraft server JAR file
RUN wget -O server.jar https://piston-data.mojang.com/v1/objects/8dd1a28015f51b1803213892b50b7b4fc76e594d/server.jar

# Agree to Minecraft's EULA by creating an 'eula.txt' file
RUN echo "eula=true" > eula.txt

# Expose the default Minecraft server port
EXPOSE 25565

# Start the Minecraft server with specified memory settings and in 'nogui' mode
CMD ["java", "-Xmx1024M", "-Xms1024M", "-jar", "server.jar", "nogui"]
