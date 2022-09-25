def call(String stageName){
	if ("${stageName}" == "Build")
	{
		sh "mvn clean package"
	}
	else if ("${stageName}" == "Sonarqube Report")
	{
		sh "mvn sonar:sonar"
	}
	else if ("${stageName}" == "Upload into Nexus")
	{
		sh "mvn deploy"
	}
}
