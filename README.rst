html2pdf
-----------------------------------

.. image:: https://github.com/qbicsoftware/html2pdf/workflows/Build%20Maven%20Package/badge.svg
    :target: https://github.com/qbicsoftware/html2pdf/workflows/Build%20Maven%20Package/badge.svg
    :alt: Github Workflow Build Maven Package Status

.. image:: https://github.com/qbicsoftware/html2pdf/workflows/Run%20Maven%20Tests/badge.svg
    :target: https://github.com/qbicsoftware/html2pdf/workflows/Run%20Maven%20Tests/badge.svg
    :alt: Github Workflow Tests Status

.. image:: https://github.com/qbicsoftware/html2pdf/workflows/QUBE%20lint/badge.svg
    :target: https://github.com/qbicsoftware/html2pdf/workflows/QUBE%20lint/badge.svg
    :alt: QUBE Lint Status

.. image:: https://img.shields.io/travis/qbicsoftware/html2pdf.svg
    :target: https://travis-ci.org/qbicsoftware/html2pdf
    :alt: Travis CI Status

.. image:: https://readthedocs.org/projects/html2pdf/badge/?version=latest
    :target: https://html2pdf.readthedocs.io/en/latest/?badge=latest
    :alt: Documentation Status

.. image:: https://flat.badgen.net/dependabot/thepracticaldev/dev.to?icon=dependabot
    :target: https://flat.badgen.net/dependabot/thepracticaldev/dev.to?icon=dependabot
    :alt: Dependabot Enabled


html2pdf. A simple Java CLI to manipulate a given HTML file and create a PDF out of it.

* Free software: MIT license
* Documentation: https://html2pdf.readthedocs.io.

Installation
--------

Checkout from this Git repository and run:

.. code-block:: bash
    
    mvn clean package
    
This will create the executable Java binaries as JAR In the folder :code:`target` (*-jar-with-dependencies.jar). 

The run the CLI with:

.. code-block:: bash

    java -jar target/html2pdf-0.1.0-SNAPSHOT-jar-with-dependencies.jar [test-file.html]
    


Credits
-------

This project was created with QUBE_.

.. _QUBE: https://github.com/qbicsoftware/qube
