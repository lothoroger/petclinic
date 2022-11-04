pipeline {
	agent any
	
	stages {
		stage('Build') {
			steps {
			//Get code from GitHub repository
			git 'https://github.com/lothoroger/petclinic.git'
			
			//Run maven wrapper
			//bat  "mvn compile"
			sh './mvn compile'
			echo 'Building the Project with Maven compiler'			
			       }
		               }
		
		stage('Test') {
			steps {
			//bat 'mvn test'
			sh './mvn test'
				echo 'Testing the PetClinic project with Maven test'
			  }
			       }
		
		stage('Deploy') {
			steps {
			//bat 'mvn package'
			sh './mvn package'	
			echo 'Deploy the project with Maven package'
				  }			
						}

	}
}
