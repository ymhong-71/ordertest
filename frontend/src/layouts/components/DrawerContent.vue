<script setup>
import {
  VerticalNavLink,
  VerticalNavSectionTitle,
} from '@layouts'
</script>

<template>
    <ul>
        <VerticalNavSectionTitle :item="{ heading: 'Order' }" />
        <VerticalNavLink
            :item="{
                title: '주문',
                to: '/orderAggregates',
            }"
        />
        <VerticalNavSectionTitle :item="{ heading: 'Shipment' }" />
        <VerticalNavLink
            :item="{
                title: '',
                to: '/',
            }"
        />
        <VerticalNavSectionTitle :item="{ heading: 'BoundedContext904_1095890410959' }" />
        <VerticalNavLink
            :item="{
                title: '',
                to: '/',
            }"
        />
    </ul>
</template>
