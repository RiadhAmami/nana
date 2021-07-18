def gv
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

      stage("init"){
        steps {
          script {
            gv = load "script.groovy"
          }
        }
      }
      stage("build"){
        steps {
<<<<<<< HEAD
          echo "building the app"
=======
          script{
          gv.buildJar()
          }

>>>>>>> c88d6106591ee7b4640bb526c77fe2febf99567d
        }
      }
      stage("test") {
        when {
          expression {
            params.executeTests
          }
        }
        steps {
          echo "testing the app"
        }
      }   
      stage("deploy"){
        steps {
<<<<<<< HEAD
          echo "deploying  the app"
=======
          echo 'deploying  the app'
          withCredentials([
              usernamePassword(credentialsId: 'github-cred',usernameVariable: 'User', passwordVariable: 'PWD')
          ]){
            echo PWD
          }
>>>>>>> c88d6106591ee7b4640bb526c77fe2febf99567d
        }

      }   
    }
}
