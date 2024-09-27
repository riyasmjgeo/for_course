pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from Git
                git url: 'https://github.com/riyasmjgeo/for_course.git', branch: 'main'
            }
        }
        stage('Run Unit Tests') {
            steps {
                // Run the Python unit tests
                sh 'python -m unittest unit_test.py'
            }
        }
    }
    post {
        always {
            // Archive test results
            junit 'test-results.xml'
        }
    }
}
