pipeline {
    agent any
     tools {
        maven 'Maven3'  // This matches the name you set in Jenkins
    }
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/Anuj7674/naukri'
            }
        }
        stage('Build & Run Tests') {
            steps {
                bat 'mvn clean test -DsuiteXmlFile=testng.xml'
            }
        }
    }
    triggers {
        cron('0 7 * * *') // Runs every day at 7:00 AM
    }
}
