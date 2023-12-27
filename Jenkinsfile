pipeline {
    agent any

    stages {
        stage('Hello') { 
            steps {
                echo 'Hello World'
            }
        }
        stage('Building') { 
            steps {
                echo 'Building'
            }
        }
        stage('Deploying') { 
            steps {
                echo 'Deploying'
            }
        }
         stage('Testing') { 
            steps {
                echo 'Testing'
            }
        }
         stage('Release') { 
            steps {
                echo 'Release'
            }
        }
    }
    
    post {
        always {
            emailext body: 'PipelineOne email body', subject: 'PipelineOne email notification', to: 'iroshan4u@gmail.com'
        }
    }
}
