# Commandler Examples [![matrix-members]][matrix] [![discord-members]][Discord] [![gitlab-build]][gitlab] [![gitlab-coverage]][gitlab] [![donate-shield]][elypia-donate]

## About
These are examples that creates minimal console applications using 
[Commandler]. This will have multiple projects in, utilizating and
demonstrating various features found in Commandler; some example may also use multiple 
features to show how they can be used together.

**This repository is intended for the purpose of example code and general
intergration testing. It's encouraged to reference or learn from this 
code but it's not written with deployment in mind.**

## Examples
This will list all examples and what they may demonstrate for users.  
All examples will list the dependencies they have that are optional for Commandler
such as the `org.elypia.commandler:validation` module, or runtime dependencies 
for types of configuration.

| Name                        | Description                                                       |
|-----------------------------|-------------------------------------------------------------------|
| `annotation-example`        | Configures Commandler with annotations.                           |
| `javax-validation-example`  | Validate command parameters with `javax.validation`.              |
| `match-dispatcher-example`  | Match commands with regular expression.                           |
| `prefix-example`            | Single controller with a command, with statically defined prefix. |
| `simple-controller-example` | Single controller and two static commands.                        |
 

## Open-Source
This project is licenced under the Apache 2.0 project, don't be afraid to derive or reference
from this project all you want.

## Support
Should any problems occur, come visit us over on [Discord]! We're always around and
there are ample developers that would be willing to help; if it's a problem with the library
itself then we'll make sure to get it sorted.

[matrix]: https://matrix.to/#/+elypia:matrix.org "Matrix Invite"
[Discord]: https://discordapp.com/invite/hprGMaM "Discord Invite"
[gitlab]: https://gitlab.com/Elypia/commandler-examples/commits/master "Repository on GitLab"
[elypia-donate]: https://elypia.org/donate "Donate to Elypia"
[Commandler]: https://gitlab.com/Elypia/commandler "Commandler on GitLab"

[matrix-members]: https://img.shields.io/matrix/elypia-general:matrix.org?logo=matrix "Matrix Shield"
[discord-members]: https://discordapp.com/api/guilds/184657525990359041/widget.png "Discord Shield"
[gitlab-build]: https://gitlab.com/Elypia/commandler-examples/badges/master/pipeline.svg "GitLab Build Shield"
[gitlab-coverage]: https://gitlab.com/Elypia/commandler-examples/badges/master/coverage.svg "GitLab Coverage Shield"
[donate-shield]: https://img.shields.io/badge/Elypia-Donate-blueviolet "Donate Shield"
