pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from the repository
                git 'https://your-repo-url.git'
            }
        }
        stage('Run Unit Test') {
            steps {
                // Run the Python script
                sh 'python3 xx.py'
            }
        }
    }
}
