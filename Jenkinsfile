<<<<<<< HEAD
pipeline {
	agent any
	
	stages {
		stage('Build') {
			steps {
				sh 'mvn compile'
				echo 'Building the PetClinic project with Maven Compiler'
				}
			}
		stage('Test') {
			steps {
				sh 'mvn test'
				echo 'Testing the PetClinic project with Maven Test'
				}
			}
		stage('Deploy') {
			steps {
				sh 'mvn package'
				echo 'Deploy the PetClinic project with Maven Package'
				}
			}
			
	 }
}

				
=======
<<<<<<< HEAD
pipeline {
	agent any
	
	stages {
		stage('Build') {
			steps {
			//Get code from GitHub repository
			git 'https://github.com/lothoroger/petclinic.git'
			
			//Run maven wrapper
			bat  "mvn compile"
			
			echo 'Building the Project with Maven compiler'			
			       }
		               }
		
		stage('Test') {
			steps {
			bat 'mvn test'
			echo 'Testing the PetClinic project with Maven test'
			  }
			       }
		
		stage('Deploy') {
			steps {
			bat 'mvn package'
			echo 'Deploy the project with Maven package'
				  }			
						}

	}
=======
pipeline {
	agent any
	
	stages {
		stage('Build') {
			steps {
			//Get code from GitHub repository
			git 'https://github.com/lothoroger/petclinic.git'
			
			//Run maven wrapper
			bat  "mvn compile"
			
			echo 'Building the Project with Maven compiler'			
			       }
		               }
		
		stage('Test') {
			steps {
			bat 'mvn test'
			echo 'Testing the PetClinic project with Maven test'
			  }
			       }
		
		stage('Deploy') {
			steps {
			bat 'mvn package'
			echo 'Deploy the project with Maven package'
				  }			
						}

	}
>>>>>>> 145bde51c36e01be735fa2ef33665c7edec9f715
}
>>>>>>> main
