#!/usr/bin/env bash

set -e

OPTS=$(getopt -o s:h --long snippet:,help -n "${0##*/}" -- "$@")
eval set -- "$OPTS"
SNIPPET=""

function usage() {
	cat <<EOF
Usage: ${0##*/} -s <snippet>
Example: ${0##*/} -s 003
EOF
	return 0
}

while true; do
	case "$1" in
		-h | --help)
			usage
			exit 0
			;;
		-s | --snippet)
			SNIPPET="$2"
			[[ -z "$SNIPPET" ]] && { usage; exit 1; }
			shift 2
			;;
		--)
			shift
			break
			;;
		*)
			echo "Internal error: Unhandled option '$1'" >&2
			exit 1
			;;
	esac
done

[[ -z "$SNIPPET" ]] && { usage; exit 1; }

export STUDIO_HOME=~/android-studio-2024.2.1.11-linux/android-studio
export JAVA_HOME=$STUDIO_HOME/jbr
SNIPPETKT=$SNIPPET.kt
[[ -d "$SNIPPET" ]] && SOURCES="$SNIPPET/*.kt"
[[ -f "$SNIPPETKT" ]] && SOURCES=$SNIPPETKT
echo "Build $SOURCES ..."
bash $STUDIO_HOME/plugins/Kotlin/kotlinc/bin/kotlinc $SOURCES -include-runtime -d "out/$SNIPPET.jar"
$JAVA_HOME/bin/java -jar "out/$SNIPPET.jar"
unset SNIPPET JAVA_HOME STUDIO_HOME
