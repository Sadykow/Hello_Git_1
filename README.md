# CAB302 Week 8 Git practical Exercise

This exercise should provide students with basic understanding how to work with huge group of people using Git Version Control.

Week 8 Thursday 26 (8-10am) S-518

## Getting Started

These instructions will get you a copy of the project up and running on your local machine. YOur task will be implement some part of the code in your own branch, merging, logging and time travel through your commits if necessary.

Keep drawing diagram, if you have to. Anything to simplify your understanding.

This task should dispel fear of screwing up during development process and loosing entire work. (even worse, screw up someones work)

### Prerequisites

Working Git and Eclipse for practice. There is no need in compilation, so work in your favorite TextEditor also acceptable.

### Installing on Windows

You have to have GIT console version. Use portable GIT or Git Bash
    https://git-scm.com/download/win

Your are free to use Cygwin. There maybe severall error cases for you to resolve. Credential Manager will be first.

### Installing on Linux 
```
sudo apt install git
```
### Installing on Mac Os 
```
brew install git
```
### Configurate for All platforms
This information stores only for logging purposes. It does not has to be real. Several your platforms might use different names. That way you will keep log personally. 
```
git config --global user.name "Risha Krasnoperova"
git config --global user.email "Risha@SmugglerSMR.com"
```
Global setting can be overriten later. It is possible to set 3 levels of config. Project, Global, System.

Create a project specific config, you have to execute this under the project's directory:
```
$ git config user.name "Matt" 
```
Create a global config:
```
$ git config --global user.name "Matt Sadykov"
```
Create a system config:
```
$ git config --system user.name "Mr Sadykov (Matt) Marat Ramilechich" 
```

## Deployment

Personal recomendation, refer to following CheatSheet:
https://zeroturnaround.com/rebellabs/git-commands-and-best-practices-cheat-sheet/

Print it and stick with table of Collections.

## Built With

* [Eclipse](http://www.dropwizard.io/1.0.2/docs/) - The web framework used
* [GitHub](https://maven.apache.org/) - Dependency Management
* [Git Commands](https://rometools.github.io/rome/) - Used to generate RSS Feeds

## Contributing

Please read [CONTRIBUTING.md](https://github.com/) too see how many my OS's girs participated in writing.

## Authors

* **Matt Sadykov** - *TodaysTutor* - [Email](m.sadykov@qut.edu.au)

## License

This project is licensed under the Eclipse License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Students for participating.
