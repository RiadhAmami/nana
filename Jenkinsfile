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
          echo "building the app"
          script{
          gv.buildImage()
          }

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
      stage("dfploy"){
        steps {
          echo "deployihe app"
      }   
    }
  }
}
