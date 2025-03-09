# Base image
FROM openjdk:11-jdk-slim

# Install dependencies
RUN apt-get update && \
    apt-get install -y \
    android-sdk \
    nodejs \
    npm \
    && rm -rf /var/lib/apt/lists/*

# Install Appium
RUN npm install -g appium@2.0.0 \
    && appium driver install uiautomator2 \
    && appium plugin install images

# Set environment variables
ENV ANDROID_HOME=/usr/lib/android-sdk
ENV PATH="${PATH}:${ANDROID_HOME}/tools/bin"

# Copy project
COPY . /app
WORKDIR /app

# Entrypoint
ENTRYPOINT ["sh", "-c", "appium & ./gradlew test"]