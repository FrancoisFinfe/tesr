require recipes-kernel/linux/linux-toradex_4.9-1.0.x.bb
FILESEXTRAPATHS_prepend := "${THISDIR}/linux-toradex-rt-4.9-1.0.x:"

SUMMARY = "Real-Time Linux kernel for Toradex Freescale i.MX based modules"

SRC_URI += " \
    https://www.kernel.org/pub/linux/kernel/projects/rt/4.9/older/patch-4.9.84-rt62.patch.gz;name=rt-patch \
    file://0001-gpu-viv-enable-PREEMPT-RT-fixes.patch \
    file://0002-mm-Work-around-the-oops-below-by-disabling-split-ptl.patch \
"

SRC_URI[rt-patch.md5sum] = "ff3eef7b14d02a689433e7a6849cae54"         
SRC_URI[rt-patch.sha256sum] = "67dd6a689a9355093b98b52d8f26e22685462797765ee44c0893fee5860d383f"

SRCREV = "07d40f6ffcbb9b3db3c146f0949725752ed61b63"
SRCBRANCH = "toradex_4.9-1.0.x-imx"
