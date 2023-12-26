# SeleniumWithJenkins
-App used: Eclipse

-Project name in Eclipse: SeleniumWebDriverManager

-Used to connect automation example project in the github with Jenkins.

-When use SSH key to connect with Github,
1. create shh key from cmd
   >ssh-keygen -t rsa -b 4096 -C "email used in github account" 
   
   2 keys will be generated in "C:\Users\Iroshan\.ssh" path
2. copy public key and paste to create a ssh key inside git setting
3. create another credential inside Jenkins credential provider.
    give id and description. Use Useranme as github username. Enter private key value already haver for private key.
4. Use this newly created credential for relavent job git Credentials
5. Job will be run successfully and git project will be clone using SSH.

-If still error occure select "accept first connection" in the Git Host Key Verification Configuration.

-Run the Maven project from cmd with parameter pass; 
always use -D before parameter name (parameter name- browser) 

 >mvn clean test -Dbrowser=chrome

-Webhooks: 
Webhooks allo external services to be notified when certain events happen. When the specified events happen, 
we'll send POST request to each of the URLs you provide.

-Inorder to config Webhook, I have seen recommendation to use 'ngrok' because jenkins host in localhost(but web was not worked).
ngrok:
cross-platform application that enavles developers to expose a local development server to the internet with minimal effort

How to install git in GCP:
Login to your Google Cloud Instance.
then run (omitting the $, of course):
$ which git
should display something like
/usr/bin/git
if not, run:
$ sudo apt-get update
Allow the update to run. Then run:
$ sudo apt-get install git
Allow the install to run. Now running:
$ which git
should return something like:
/usr/bin/git

-In Jenkins:
To export the Job.
java -jar jenkins-cli.jar -s <your server url> get-job <JOB NAME> > <JOB_NAME.xml>
OR
java -jar jenkins-cli.jar -s <your server url> -auth username:password get-job <JOB NAME> > <JOB_NAME.xml>

To Create/import the Job
java -jar jenkins-cli.jar -s <your server url> create-job <NEW_JOB_NAME> < <EXITING_JOB.xml>
OR
java -jar jenkins-cli.jar -s <your server url> -auth username:password create-job <NEW_JOB_NAME> < <EXITING_JOB.xml>

