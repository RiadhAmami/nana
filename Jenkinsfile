pipeline {
    agent any
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
            sh "some script ${User} and ${PWD}"
          }
        }

      }   
    }
}
