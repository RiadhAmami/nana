pipeline {
    agent any
    parameters {
        choice(name: 'VERSION',choices:['1','2'],description: '')
        booleanParam(name: 'executeTests',defaultValue: true,description: '')
    }
    environment {
      NEW_VERSION = '1.3.0'
    }
    stages {
      stage("build"){
        steps {
          echo "building the app"
          echo "building version ${NEW_VERSION}"

        }
      }
      stage("test") {
        when {
          expression {
            env.BRANCH_NAME == 'master'  
          }
        }
        steps {
          echo "testing the app"
        }
      }   
      stage("deploy"){
        steps {
          echo "deploying  the app"
          withCredentials([
              usernamePassword(credentialsId: 'github-cred',usernameVariable: 'User', passwordVariable: 'PWD')
          ]){
            echo PWD
          }
        }

      }   
    }
}
