pipeline {
    agent any

    stages {
        stage('compile') {
            steps {
                echo 'compile'
                mvn compile
            }
        }
        stage('package') {
            steps {
                echo 'package'
            }
        }
    }
}