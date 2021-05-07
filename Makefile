install:
	./gradlew clean install
	./gradlew checkstyleMain

run-dist:
	./build/install/app/bin/app

check-updates:
	./gradlew dependencyUpdates

lint:
	./gradlew checkstyleMain
