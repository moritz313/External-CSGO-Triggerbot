# External-CSGO-Triggerbot
![alt text](https://i.imgur.com/LECR4dZ.png "Main Banner")
![alt text](https://img.shields.io/badge/Language%3A-Java-red "Badge")
![alt text](https://img.shields.io/badge/State%3A-Alpha-red "Badge")
![alt text](https://img.shields.io/github/languages/code-size/moritz313/External-CSGO-Triggerbot "Badge")
![alt text](https://img.shields.io/github/last-commit/moritz313/External-CSGO-Triggerbot "Badge")


## External CSGO Triggerbot made with java
To be used exclusively on private servers and for Educational Purpose only.
I am not responsible for bans or anything similar.

## How does this work?
Basically, what the programme does is it remembers the colour pixels in the middle of the screen and as soon as it detects a change, it presses mouse button 1.

## How to use?
First you start the program.
Then you start the game as usual, position your crosshair and press the X key and do not move the mouse. 
As soon as an enemy runs through the Crosshair, the Triggerbot should shoot.
After each shot you have to press X again to set the trigger bot.
When you want to end the program, press "O".

## Limitations:
Since the triggerbot reacts to color changes, there are many false starts. It does not distinguish between opponent or teammate and can also be triggered by a simple grenade etc.

## Preview:
https://user-images.githubusercontent.com/66872504/164758540-1c0f1974-ce6b-46e0-8b2d-002383423d49.mp4





## Used Libraries:
[JNativeHook: Global keyboard and mouse listeners for Java](https://github.com/kwhat/jnativehook)
