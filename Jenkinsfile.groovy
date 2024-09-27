pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from the repository
                git 'https://github.com/riyasmjgeo/for_course.git'
            }
        }
        stage('Run Unit Test') {
            steps {
                // Run the Python script
                sh 'python3 unit_test.py'
            }
        }
    }
}
