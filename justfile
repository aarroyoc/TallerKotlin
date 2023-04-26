default: clean kotlin

clean:
  rm -rf build

kotlin:
  mkdir -p build
  kotlinc -d build -cp jars/*.jar src/main/kotlin/*.kt

exec-coroutines:
  kotlin -cp jars/kotlinx-coroutines-core-jvm-1.6.4.jar:build coroutines1.Coroutines1Kt
