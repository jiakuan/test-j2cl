This sample is created using the following command:

```shell
mvn archetype:generate -DarchetypeGroupId=com.vertispan.j2cl.archetypes \
  -DarchetypeArtifactId=j2cl-archetype-simple \
  -DarchetypeVersion=0.21-SNAPSHOT \
  -DgroupId=org.docstr.j2cl \
  -DartifactId=test-j2cl \
  -Dversion=1.0-SNAPSHOT \
  -Dmodule=TestJ2CL
```

Then add a dependency:

```xml
<dependency>
  <groupId>org.treblereel.j2cl.processors</groupId>
  <artifactId>annotations</artifactId>
  <version>0.6</version>
</dependency>

<dependency>
<groupId>org.treblereel.j2cl.processors</groupId>
<artifactId>processors</artifactId>
<version>0.6</version>
<scope>provided</scope>
</dependency>
```

Rename `org/docstr/j2cl/TestJ2CL.native.js` to `org/docstr/j2cl/TestJ2CL.native.js__` and add `@GWT3EntryPoint` annotation to `org.docstr.j2cl.TestJ2CL` class:

```java
  @GWT3EntryPoint
  public void onModuleLoad() {
    // ...
  }
```

Then run the following command to build:

```shell
mvn j2cl:build
```

The generated JS file is located at `target/test-j2cl-1.0-SNAPSHOT/test-j2cl/test-j2cl.js`.
