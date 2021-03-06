def buildJar() {
    echo "building the application..."
    sh 'mvn package'
} 

def buildImage() {
    echo "building the docker image..."
    withCredentials([usernamePassword(credentialsId: 'docker-cred', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh 'docker build -t docker.galactechstudio.com/demo-app:jma-2.0 .'
        sh "echo $PASS | docker login https://docker.galactechstudio.com -u $USER --password-stdin"
        sh 'docker push docker.galactechstudio.com/demo-app:jma-2.0'
    }
} 

def deployApp() {
    echo 'deploying the application...'
} 

return this
