cnd-editor 
==========

[JCR](http://en.wikipedia.org/wiki/Content_repository_API_for_Java) ([JSR-283](http://jcp.org/en/jsr/detail?id=283))
Compact Namespace and Node Type Definition ([CND](http://jackrabbit.apache.org/node-type-notation.html)) Editor.

The editor is built as eclipse plugin and supports code completion, validation, navigation, basic refactoring, syntax highlighting, 
auto formatting, code templates, outline and code generation. See [project site](http://evra.github.io/cnd-editor/) for more details. 

The editor is based on [Xtext](http://www.eclipse.org/Xtext/) and can be used to build other DSL which need to reference CND.
For example one can reuse CND grammar to [build](https://github.com/evra/sling-contenteditor) jcr content descriptor DSL. It can be also used for java code generation using
[xtend](http://www.eclipse.org/xtend/) language (for [example](https://github.com/evra/cnd2pojo-generator-example) POJO classes generation based on node type definitions).

Visit users and developers discussion [group](https://groups.google.com/forum/#!forum/cnd-editor) if you have any questions or suggestions. 

Status [![Build Status](https://travis-ci.org/evra/cnd-editor.png)](https://travis-ci.org/evra/cnd-editor)
--
The project is in beta phase however the editor is stable and has most of the features required to create complex CND files. 
Bug reports, feature requests, merge requests are wellcome.

Installation
--
This is an eclipse plugin and requires eclipse 4.3 (Kepler). 

You can use our eclipse update site [http://dl.bintray.com/evra/eclipse](http://dl.bintray.com/evra/eclipse). 
Release information is also available at our [bintray page](https://bintray.com/evra/eclipse/cnd-editor).

Alternatively you can install the package manually from github:
* Download the latest [release](https://github.com/evra/cnd-editor/releases) package.
* Install the package using the eclipse update manager: Help -> Insall new software -> Add -> Archive -> Select downloaded package
* Select "JCR CND Editor Feature", select "Contact all update sites during install to find required software" 
* Click finish and restart eclipse.

Development
--
See [dev README](/releng/com.evrasoft.jcr.repository.parent/README.md) how to setup dev environment and start extending the editor.

Contact
--
evgeny@evrasoft.com
