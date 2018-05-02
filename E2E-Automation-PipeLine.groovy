node {
   stage('Git checkout') { // for display purposes
      git 'https://github.com/arunaousula9421/Automation-BuildPipeline.git'
   }
   stage('UI') {
        try {
            sh "mvn verify -Dtags='type:UI'"
        } catch (err) {
            
        } finally {
            publishHTML (target: [
            reportDir: 'target/site/serenity',
            reportFiles: 'index.html',
            reportName: "UI Test Report"
            ])
        }
   }
   stage('Results') {
      junit '**/target/failsafe-reports/*.xml'
   }
}
