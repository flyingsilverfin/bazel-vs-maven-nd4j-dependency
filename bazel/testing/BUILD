java_library(
    name = "testing",
    srcs = ["Main.java"],
    deps = [
        "//dependencies/maven/artifacts/org/apache/commons:commons-math3",
#        "//dependencies/mavne/artifacts/org/nd4j:ndj-native"
    ]
)

java_binary(
    name = "testing-binary",
    main_class = "testing.Main",
    runtime_deps = [":testing"],
    visibility = ["//visibility:public"]
)