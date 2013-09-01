cnd-editor
==========

JCR (JSR-283) Compact Namespace and Node Type Definition (CND) Editor.

The editor is built as eclipse plugin and supports code completion, validation, navigation, basic refactoring, syntax highlighting, 
auto formatting, code templates, outline and code generation. 

The editor is based on [Xtext](http://www.eclipse.org/Xtext/) and can be used to build other DSL which need to reference CND.
For example one can reuse CND grammar to build jcr content descriptor DSL. It can be also used for java code generation using
[xtend](http://www.eclipse.org/xtend/) language (for example POJO classes generation based on node type definitions).


Status
--
The project is in beta phase however the editor is stable and has most of the features required to create complex CND files. 
Bug reports, feature requests, merge requests are wellcome.

Installation
--
This is an eclipse plugin and requires eclipse 4.3 (Kepler). 

* Download the latest release package.
* Install the package using the eclipse update manager: Help -> Insall new software -> Add -> Archive -> Select downloaded package
* Select "JCR CND Editor Feature", select "Contact all update sites during install to find required software" 
* Click finish and restart eclipse.

Development
--
See [dev README](/releng/com.evrasoft.jcr.repository.parent/README.md) how to setup dev environment and start extending the editor.
