def gv
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
            BRANCH_NAME == 'master'  && CODE_CHANGES == true
          }
        }
        steps {
          echo "testing the app"
        }
      }   
      stage("deploy"){
        steps {
        echo "deploying  the app"
        }
      }   
    }
}
