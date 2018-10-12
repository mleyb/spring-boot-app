node {
    timestamps {
        stage('Checkout'){
            checkout scm
        }
        stage('Build') {
            if (isUnix()) {
                sh './gradlew clean jar'
            } else {
                bat 'gradlew.bat clean jar'
            }
        }
        stage('Test') {
            if (isUnix()) {
                sh './gradlew test'
            } else {
                bat 'gradlew.bat test'
            }
        }
    }
}
