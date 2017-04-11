#!/usr/bin/env bash

set -e

if [ -z "$@" ]; then
	${WORK_DIR}/start.sh
else
	exec "$@"
fi