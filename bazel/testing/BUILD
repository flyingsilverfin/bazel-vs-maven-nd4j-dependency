config_setting(
    name = "osx_build",
    constraint_values = [
   		"@bazel_tools//platforms:osx",
        "@bazel_tools//platforms:x86_64",
    ]
)

config_setting(
    name = "linux_build",
    constraint_values = [
   		"@bazel_tools//platforms:linux",
        "@bazel_tools//platforms:x86_64",
    ]
)

java_library(
	name = "nd4j-native-platform-independent",
	exports = select({
		":linux_build": ["//dependencies/maven/artifacts/org/nd4j:nd4j-native-jar-linux-x86-64"],
		":osx_build": ["//dependencies/maven/artifacts/org/nd4j:nd4j-native-jar-macosx-x86-64"]
	})
)

java_library(
    name = "testing",
    srcs = ["Main.java"],
    deps = [
        "//dependencies/maven/artifacts/org/nd4j:nd4j-native",
        "//dependencies/maven/artifacts/org/nd4j:nd4j-api",
        "//dependencies/maven/artifacts/org/nd4j:nd4j-native-api",
        ":nd4j-native-platform-independent"
    ]
)

java_binary(
    name = "testing-binary",
    main_class = "testing.Main",
    runtime_deps = [":testing"],
    visibility = ["//visibility:public"]
)