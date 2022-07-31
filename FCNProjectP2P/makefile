JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
		$(JC) $(JFLAGS) $*.java

CLASSES = \
        Message.java \
		MessageManager.java \
		PeerProcess.java \
		Utils.java \
		LogRecords.java \
		FileProcessing.java \
		Peer.java \
		CommonConfig.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
		$(RM) *.class
