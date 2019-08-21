# Copyright (C) 2014-2019 Linaro
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Linaro Qualcomm Landing team 5.2 Kernel"
LIC_FILES_CHKSUM = "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"

inherit pythonnative

require recipes-kernel/linux/linux-linaro-qcom.inc
require recipes-kernel/linux/linux-qcom-bootimg.inc

LOCALVERSION ?= "-linaro-lt-qcom"
SRCBRANCH ?= "release/db845c/qcomlt-5.2"
SRCREV ?= "60a1887b0ed6c49bbb1a6feaf427b6abd33c1f16"

COMPATIBLE_MACHINE = "(sdm845)"

# Wifi firmware has a recognizable arch :( 
ERROR_QA_remove = "arch"
