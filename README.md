# Game-Awards


<h4 align="center"> 
	 Project GameAwards
</h4>
<p align="center">
  <img alt="GitHub language count" src="https://img.shields.io/github/languages/count/EliezerGarbin/Game-Awards">

  <img alt="Repository size" src="https://img.shields.io/github/repo-size/EliezerGarbin/Game-Awards">
	
  <a href="https://www.linkedin.com/in/eliezergarbin/">
    <img alt="Made by eliezergarbin" src="https://img.shields.io/badge/made%20by-eliezergarbin-%2304D361">
  </a>

  <a href="https://github.com/EliezerGarbin/Game-Awards/commits/main">
    <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/EliezerGarbin/Game-Awards">
  </a>

  <img alt="License" src="https://img.shields.io/badge/License-Apache%202.0-brightgreen.svg">
   <a href="https://github.com/EliezerGarbin/Game-Awards/stargazers">
    <img alt="Stargazers" src="https://img.shields.io/github/stars/EliezerGarbin/Game-Awards?style=social">
  </a>
</p>
<p align="center">
<a href="https://app.getpostman.com/run-collection/513543c13b20fe5c4a44?action=collection%2Fimport"><img src="https://run.pstmn.io/button.svg" alt="Run in Postman"></a>
</p>

<p align="center">
  <a href="#project">Project</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#technologies">Technologies</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#how-to-use">How To Use</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#documentation">Documentation</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#how-to-contribute">How to contribute</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#license">License</a>
</p>


## Project
The application simulates the GOTY (Game of the Year) event of The Game Awards, where an annual award ceremony honors achievements in the video game industry.
Instead of the original where winners are determined by a mixed vote between the jury (which equals 90% of the final results) and the public vote (equivalent to 10%), the application only determines the winner with the user's popular votes.


#### Server 
Using Java 17 and Spring Boot 3 with Spring Data to create RESTful and JPA APIs with the H2 database because of its ease of accessing the database interface through the browser.

#### Mobile
In the mobile part, Typescprit was used with the React Native framework + React Hooks and Expo (a tool that brings a series of pre-configured components and an easy way to test the application) were consumed. React-navigation was also used to facilitate navigation in the application.


## Technologies
This project was developed with the following technologies:

- [Java][java]
- [Spring Boot][spring]
- [H2][h2]
- [TypeScript][typescript]
- [React-Native][react-native]
- [Expo][expo]


## How To Use

To clone and run this application, you'll need [Git](https://git-scm.com), [Node.js][nodejs] + [npm][npm] and [Java JDK][javase] + [Eclipse][eclipse] or your Java IDE preferably installed on your computer.

From your command line:

### Install server

```bash
# Clone this repository
$ git clone https://github.com/EliezerGarbin/Game-Awards.git


# Go into the repository
$ cd Game-Awards/server

# Open Eclipse in this directory

# Press Ctrl + Shift + Alt + B, R keys to start the application


# running on port 8080
```

### Install mobile

```bash
# Clone this repository
$ git clone https://github.com/EliezerGarbin/Game-Awards.git

# Go into the repository
$ cd Game-Awards/mobile

# Install dependencies
$ npm install

# Run
$ expo start

# Expo will open, just scan the qrcode on terminal or expo page
```

## Documentation
The documentation uses the OpenAPI 3.0 standard. You can access the API documentation using the ``` /swagger-ui/index.html#/ ``` endpoint after running the project.


## How to contribute

- Make a fork;
- Create a branck with your feature: `git checkout -b my-feature`;
- Commit changes: `git commit -m 'feat: My new feature'`;
- Make a push to your branch: `git push origin my-feature`.

After merging your receipt request to done, you can delete a branch from yours.

## License

This project is under the Apache 2.0 license. See the [LICENSE](https://github.com/eliezergarbin/Game-Awards/blob/main/LICENSE) for details.


Made with by Eliézer Garbin :wave: [Get in touch!](https://www.linkedin.com/in/eliezergarbin/)

[java]: https://www.java.com/en/
[javase]: https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html
[spring]: https://spring.io/projects/spring-boot
[eclipse]: https://www.eclipse.org/downloads/
[expo]: https://expo.io/
[react-native]: https://reactnative.dev/
[typescript]: https://www.typescriptlang.org/
[h2]: https://www.h2database.com/html/main.html
[npm]: https://www.npmjs.com/
[nodejs]: https://nodejs.org/
