  zreladdr-y		:= 0x10008000
params_phys-y		:= 0x10000100
initrd_phys-y		:= 0x10800000

ifeq ($(CONFIG_ARCH_QSD8X50),y)
  zreladdr-y		:= 0x20008000
params_phys-y		:= 0x20000100
initrd_phys-y		:= 0x21000000
endif

ifeq ($(CONFIG_ARCH_MSM7201A),y)
  zreladdr-y            := 0x10008000
params_phys-y           := 0x10000100
initrd_phys-y           := 0x10800000
endif

ifeq ($(CONFIG_ARCH_MSM7200A),y)
  zreladdr-y            := 0x19208000
params_phys-y           := 0x19200100
initrd_phys-y           := 0x19A00000
endif

ifeq ($(CONFIG_ARCH_MSM7225),y)
  zreladdr-y            := 0x02E08000
params_phys-y           := 0x02E00100
initrd_phys-y           := 0x03E00000
endif

ifeq ($(CONFIG_ARCH_MSM7227),y)
  zreladdr-y              := 0x12C08000
params_phys-y           := 0x12C00100
initrd_phys-y           := 0x13400000
endif

ifeq ($(CONFIG_ARCH_MSM7X00A),y)
  zreladdr-y            := 0x19208000
params_phys-y           := 0x19200100
initrd_phys-y           := 0x19A00000
  zreladdr-$(CONFIG_MACH_DESIREC)            := 0x11208000
params_phys-$(CONFIG_MACH_DESIREC)           := 0x11200100
initrd_phys-$(CONFIG_MACH_DESIREC)           := 0x11A00000
endif

