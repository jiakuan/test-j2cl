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
  <version>0.5.1</version>
</dependency>
```

And configure annotation processor:

```xml
<plugin>
  <artifactId>maven-compiler-plugin</artifactId>
  <version>${maven.compiler.plugin.version}</version>
  <configuration>
    <source>${maven.compiler.source}</source>
    <target>${maven.compiler.target}</target>

    <annotationProcessorPaths>
      <path>
        <groupId>org.treblereel.j2cl.processors</groupId>
        <artifactId>processors</artifactId>
        <version>0.5.1</version>
      </path>
    </annotationProcessorPaths>
  </configuration>
</plugin>
```
