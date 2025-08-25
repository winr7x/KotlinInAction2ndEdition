# KotlinInAction2ndEdition

```
export \
SNIPPET=001 \
STUDIO_HOME=~/android-studio-2024.2.1.11-linux/android-studio && \
JAVA_HOME=$STUDIO_HOME/jbr && \
\
bash $STUDIO_HOME/plugins/Kotlin/kotlinc/bin/kotlinc $SNIPPET/main.kt -include-runtime -d out/$SNIPPET.jar && \
$JAVA_HOME/bin/java -jar out/$SNIPPET.jar; \
unset SNIPPET JAVA_HOME STUDIO_HOME
```
