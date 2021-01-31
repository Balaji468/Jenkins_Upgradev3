pipeline {
      agent any
      stages {
            stage('Init') {
                  steps {
                        sh 'Hi, this is Anshul from LevelUp360'
                        sh 'We are Starting the Testing'
                  }
            }
            stage('Build') {
                  steps {
                        sh 'Building Sample Maven Project'
                  }
            }
            stage('Deploy') {
                  steps {
                        sh 'Deploying in Staging Area'
                  }
            }
            stage('Deploy Production') {
                  steps {
                        sh 'Deploying in Production Area'
                  }
            }
      }
}