pipeline {
    agent any

    environment {
        GIT_REPO = 'https://github.com/Anuj7674/naukri.git'
        BRANCH = 'master' // replace with your branch if needed
    }

    triggers {
    cron('0 13 * * *') // Runs every day at 13:00 (1 PM)
}

    stages {
        stage('Checkout') {
            steps {
                // Clean workspace and checkout code
                deleteDir()
                git branch: "${BRANCH}", url: "${GIT_REPO}"
            }
        }

        stage('Build') {
            steps {
                // Compile project
                sh 'mvn clean compile'
            }
        }

        stage('Run Tests') {
            steps {
                // Execute TestNG tests
                sh 'mvn test -DsuiteXmlFile=testng.xml'
            }
        }

        stage('Archive Reports') {
            steps {
                // Archive and publish TestNG reports
                archiveArtifacts artifacts: '**/target/surefire-reports/*.html', allowEmptyArchive: true
                publishHTML(target: [
                    allowMissing: true,
                    alwaysLinkToLastBuild: true,
                    keepAll: true,
                    reportDir: 'target/surefire-reports',
                    reportFiles: 'index.html',
                    reportName: 'TestNG Report'
                ])
            }
        }
    }

    post {
        success {
            echo '✅ Build and Tests Passed!'
        }
        failure {
            echo '❌ Build or Tests Failed!'
        }
    }
}
