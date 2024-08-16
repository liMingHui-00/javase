<script setup>
import HeadNaigation from '@/components/top/HeadNavigation.vue'
import CarouselImage from '@/components/Carousel/CarouselImage.vue'
import MidBar from '@/components/midbar/MidBar.vue'
import SideBar from '@/components/sidebar/SideBar.vue'

</script>

<template>
  <div>
    <HeadNaigation></HeadNaigation>
    <CarouselImage></CarouselImage>
    <MidBar></MidBar>
    <SideBar></SideBar>
  </div>
</template>

<style scoped>
div {
  position: relative;
}
</style>
