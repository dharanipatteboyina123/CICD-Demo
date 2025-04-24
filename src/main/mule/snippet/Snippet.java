package snippet;

public class Snippet {
	public static void main(String[] args) {
		<muleVersion>${app.runtime}</muleVersion>
		      <username>${username}</username>
		      <password>${password}</password>
		      <applicationName>${cloudhub.application.name}</applicationName>
		      <environment>${environment}</environment>
		      <region>${region}</region>
		      <workers>${workers}</workers>
		      <workerType>${workerType}</workerType>
	}
}

