pipeline {
	agent any
	tools { 
        maven '3.2.5' 
       }
	stages {
		stage('Build') {
			steps {
				sh 'mvn clean package'
				echo 'Building/Test/Deploy  the PetClinic project with Maven'
				}
			}
			
	 }
}

