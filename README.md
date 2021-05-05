# Java--
Java-- is a simpler version of Java aiming to teach programming.

It is implemented with **Xtext**, https://www.eclipse.org/Xtext, and **Jbase**, https://github.com/LorenzoBettini/jbase.

## Installation

Starting from version 1.7.0, Java-- **requires Java 8**.

You can either install Java-- SDK into an existing Eclipse or download a pre-configured Eclipse distribution with Java-- installed (choosing the one for your operating system).

### Eclipse update site (updated)

**IMPORTANT**: _the old Bintray update site does not work anymore, make sure you use the new one and remove the old one_.

Copy the following URL and paste it into your Eclipse "Install New Software" dialog ("Help" => "Install New Software..."), wait for the list of available features to show and select the latest version of "Javamm SDK feature". (The URL is NOT meant to be opened with a browser). TIP: use the "type filter text" to quickly filter the features, e.g., start typing "Javamm".

**https<span></span>://lorenzobettini.github.io/javamm-releases/**

![Install New Software Screenshot](images/javamm-installation.png)

IMPORTANT: Java-- requires Xtext, if this is not already installed, all dependencies will be automatically installed form this update site, which is self-contained.

### Pre-configured Eclipse distributions with Java-- installed, for several architectures.

Download a complete Eclipse distribution with Java-- installed; choose the one for your OS and architecture:
https://sourceforge.net/projects/javamm/files/products/

[![Java CI with Maven](https://github.com/LorenzoBettini/javamm/actions/workflows/maven.yml/badge.svg)](https://github.com/LorenzoBettini/javamm/actions/workflows/maven.yml) [![Coverage Status](https://coveralls.io/repos/github/LorenzoBettini/javamm/badge.svg?branch=master)](https://coveralls.io/github/LorenzoBettini/javamm?branch=master) [![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=javamm%3Ajavamm.releng&metric=alert_status)](https://sonarcloud.io/dashboard?id=javamm%3Ajavamm.releng)
