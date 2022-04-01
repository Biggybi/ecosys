RM = rm
RMF = rm -rf
MKDIR = mkdir

MAIN_DIR = ecosys
MAIN_FILE = Main.class

SRCS = $(wildcard $(MAIN_DIR)/*.java)

CLASSES = $(SRCS:%.java=%.class)

JC = javac
JCFLAGS = -g

.SUFFIXES: .java

all: $(CLASSES)

$(CLASSES): %.class: %.java
	$(JC) $(JCFLAGS) $<

clean:
	$(RM) $(CLASSES)

re: clean all

test:
	java $(MAIN_DIR).$(MAIN_FILE:%.class=%)
.PHONY: fclean all
