pipeline {
    agent any
    environment {
      NEW_VERSION = '1.3.0'
      server_cred = credentials('github-cred')
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
            ${BRANCH_NAME} == 'master'  
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
              usernamePassword(credentials: 'github-cred',usernameVariable: User,passwordVariable: pwd)
          ]){
            sh "some script ${User} and ${pwd}"
          }
        }

      }   
    }
}
