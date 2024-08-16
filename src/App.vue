<script setup>
import HeadNaigation from '@/components/top/HeadNavigation.vue'
import CarouselImage from '@/components/Carousel/CarouselImage.vue'
import MidBar from '@/components/midbar/MidBar.vue'
import SideBar from '@/components/sidebar/SideBar.vue'
import PhoneBar from '@/components/phonebar/PhoneBar.vue';

</script>

<template>
  <div>
    <HeadNaigation></HeadNaigation>
    <CarouselImage></CarouselImage>
    <MidBar></MidBar>
    <SideBar></SideBar>
    <PhoneBar></PhoneBar>
  </div>
</template>

<style scoped>
div {
  position: relative;
}
</style>
