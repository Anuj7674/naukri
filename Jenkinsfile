pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/Anuj7674/naukri'
            }
        }
        stage('Build & Run Tests') {
            steps {
                sh 'mvn clean test -DsuiteXmlFile=testng.xml'
            }
        }
    }
    triggers {
        cron('0 7 * * *') // Runs every day at 7:00 AM
    }
}
