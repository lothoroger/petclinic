pipeline {
	agent any
	
	stages {
		stage('Build') {
			steps {
			//Get code from GitHub repository
			git 'https://github.com/lothoroger/petclinic.git'
			
			//Run maven wrapper
			//bat  "mvn compile"
			sh "chmod +x -R ${env.WORKSPACE}"	
			sh "./mvnw compile"
			echo 'Building the Project with Maven compiler'			
			       }
		               }
		
		stage('Test') {
			steps {
			//bat 'mvn test'
			sh "chmod +x -R ${env.WORKSPACE}"	
			sh "./mvnw test"
				echo 'Testing the PetClinic project with Maven test'
			  }
			       }
		
		stage('Deploy') {
			steps {
			//bat 'mvn package'
			sh "chmod +x -R ${env.WORKSPACE}"	
			sh "./mvnw package"	
			echo 'Deploy the project with Maven package'
				  }			
						}

	}
}
