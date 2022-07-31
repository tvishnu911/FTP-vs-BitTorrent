(a) Group Members:
		Vamshi Krishna Reddy Vaka
		Sai Chandan Masipeddi
		Vishnu Tammishetti


(b) Compilation/execution steps for P2P:
		In order to test/execute this project below steps are required (in order):

		1. Run the make file using the "make" command.
		
		2. Store "the file" in each of the peer directories.

		3. Run the PeerProcess file using the following format,
			
			javac PeerProcess.java
			
			java PeerProcess <Peer ID>
			
		4. The log file will be generated in the peer's directory.



(c) Compilation/execution steps for FTP:
		In order to test/execute this project below steps are required (in order):

		1. Navigate to directory named server and compile server file using below command:

			javac myftpserver.java

		2. Run server using below command:

			java myftpserver <NPORT NUMBER> <TPORT NUMBER>

			ex. java myftpserver 3000 4000

		3. Navigate to directory named client and compile client file using below command:

			javac myftp.java

		4. Run the client using below command:

			java myftp <SERVER MACHINE NETWORK ADDRESS> <NPORT NUMBER> <TPORT NUMBER>

			ex. java myftp localhost 3000 4000
				java myftp 127.0.0.1 3000 4000
				
